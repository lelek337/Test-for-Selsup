package com.example.ivanforselsup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class IvanForSelsupApplication {

    public static void main(String[] args) {
        // Пример использования CrptApi
        try {
            CrptApi api = new CrptApi(TimeUnit.MINUTES, 10);

            // Создайте объект документа
            CrptApi.Document document = new CrptApi.Document();
            document.doc_id = "123";
            document.doc_status = "NEW";
            document.owner_inn = "1234567890";
            document.participant_inn = "0987654321";
            document.producer_inn = "1234567890";
            document.production_date = "2020-01-23";
            document.production_type = "TYPE";
            document.reg_date = "2020-01-23";
            document.reg_number = "REG123";
            document.importRequest = true;

            // Пример подписи
            String signature = "signature_example";

            // Вызов метода создания документа
            String response = api.createDocument(document, signature);
            System.out.println("Response: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}