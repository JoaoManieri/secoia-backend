package com.manieri.projetosequoia.ui.costumers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manieri.projetosequoia.model.Empresa;

public class HTTPRequestCNPJ {

    public Empresa getInfo(String cnpj) {

        Empresa empresa = null;

        try {
            // URL da API
            String apiUrl = "https://receitaws.com.br/v1/cnpj/" + cnpj;

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

            ObjectMapper mapper = new ObjectMapper();
            empresa = mapper.readValue(reader, Empresa.class);

            reader.close();


            // Fecha a conexão
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return empresa;

    }
}
