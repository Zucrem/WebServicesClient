/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.xml.datatype.DatatypeConfigurationException;
import sevices.Covidweek;

/**
 *
 * @author Zucrem
 */

public class CovidSoapClient {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        getJson();
        List <Covidweek> covidList = findAllCovidWeek();
        System.out.println("Insert Seccuss");
        System.out.println(covidList);
    }

    public static void getJson() throws Exception {
        URL obj = new URL("https://covid19.ddc.moph.go.th/api/Cases/today-cases-all");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            String json = response.toString();
            
            JsonReader jsonr = Json.createReader(new StringReader(json));
            JsonArray jsona = jsonr.readArray();
            jsonr.close();
            
            JsonObject firstname = jsona.getJsonObject(0);
            
            int year = firstname.getInt("year");
            int weeknum = firstname.getInt("weeknum");
            int new_case = firstname.getInt("new_case");            
            int total_case = firstname.getInt("total_case");
            int new_case_excludeabroad = firstname.getInt("new_case_excludeabroad");
            int total_case_excludeabroad = firstname.getInt("total_case_excludeabroad");
            int new_recovered = firstname.getInt("new_recovered");
            int total_recovered = firstname.getInt("total_recovered");
            int new_death = firstname.getInt("new_death");
            int total_death = firstname.getInt("total_death");
            int case_foreign  = firstname.getInt("case_foreign");
            int case_prison = firstname.getInt("case_prison");
            int case_walkin = firstname.getInt("case_walkin");
            int case_new_prev = firstname.getInt("case_new_prev");
            int case_new_diff = firstname.getInt("case_new_diff");
            int death_new_prev = firstname.getInt("death_new_prev");
            int death_new_diff = firstname.getInt("death_new_diff");
            String update_date = firstname.getString("update_date");
            
            SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = DateFor.parse(update_date);
                        
             addDatabase(year,weeknum,new_case,total_case,new_case_excludeabroad,total_case_excludeabroad,new_recovered,total_recovered,new_death,total_death,case_foreign,case_prison,case_walkin,case_new_prev,case_new_diff,death_new_prev,death_new_diff,date);
        } else {
            System.out.println("GET request Error.");
        }
    }
    
    private static java.util.List<sevices.Covidweek> findAllCovidWeek() {
        sevices.CovidWebSevice_Service service = new sevices.CovidWebSevice_Service();
        sevices.CovidWebSevice port = service.getCovidWebSevicePort();
        return port.findAllCovidWeek();
    }

    private static void insertCovidWeek(sevices.Covidweek covidWeek) {
        sevices.CovidWebSevice_Service service = new sevices.CovidWebSevice_Service();
        sevices.CovidWebSevice port = service.getCovidWebSevicePort();
        port.insertCovidWeek(covidWeek);
    }

    private static void addDatabase(int year,int weeknum,int new_case,int total_case,int new_case_excludeabroad,int total_case_excludeabroad,int new_recovered,int total_recovered,int new_death,int total_death,int case_foreign,int case_prison,int case_walkin,int case_new_prev,int case_new_diff,int death_new_prev,int death_new_diff,Date date) throws DatatypeConfigurationException {
        Covidweek covid = new Covidweek(year,weeknum,new_case,total_case,new_case_excludeabroad,total_case_excludeabroad,new_recovered,total_recovered,new_death,total_death,case_foreign,case_prison,case_walkin,case_new_prev,case_new_diff,death_new_prev,death_new_diff,date);
        insertCovidWeek(covid);
    }

    
    
}
