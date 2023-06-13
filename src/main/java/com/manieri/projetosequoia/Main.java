package com.manieri.projetosequoia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            // URL da API
            String apiUrl = "https://receitaws.com.br/v1/cnpj/44762458000153";

            // Cria a URL do request
            URL url = new URL(apiUrl);

            // Abre a conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Define o método de request (GET, POST, etc)
            connection.setRequestMethod("GET");

            // Obtém a resposta da API
            int responseCode = connection.getResponseCode();

            // Lê a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Exibe a resposta
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response Body: " + response.toString());

            // Fecha a conexão
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
