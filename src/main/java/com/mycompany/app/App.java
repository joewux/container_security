package com.mycompany.app;

import java.net.URL;
import java.io.*;
import javax.net.ssl.HttpsURLConnection;

public class App
{

    private final String message = "Simple Java Maven Web App!";

    public App() {}

    public static void main(String[] args) throws Exception {
        String httpsURL = "https://google.com/";
        URL myUrl = new URL(httpsURL);
        HttpsURLConnection conn = (HttpsURLConnection)myUrl.openConnection();
        InputStream is = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String inputLine;

	System.out.println(new App().getMessage());
        while ((inputLine = br.readLine()) != null) {
            System.out.println(inputLine);
        }

        br.close();

    }

    private final String getMessage() {
        return message;
    }

}
