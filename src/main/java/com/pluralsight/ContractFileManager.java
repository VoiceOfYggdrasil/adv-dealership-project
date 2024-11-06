package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ContractFileManager {
    private String fileName = "contracts.csv";

    public void saveContract(Contract contract) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));

            bufferedWriter.write(contract.toString());
            bufferedWriter.newLine();

            System.out.println(fileName + "updated successfully");
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("ERROR: Cannot Write to File.");
        }
    }
}
