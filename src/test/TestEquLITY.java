package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestEquLITY {


    public static void main(String[] args) throws IOException {
        //Employee emp = createEmployee();

        // Get Gson object
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // read JSON file data as String
        String fileData = new String(Files.readAllBytes(Paths
                .get("/Users/ssanapat/AWSSCMVendorVisibilityDataIngestionBatchModule/AlgoDs/src/test/Test.txt")));

        // parse json string to object
        //Employee emp1 = gson.fromJson(fileData, Employee.class);

        CreateShipmentClassRequestModel c1 = gson.fromJson(fileData,CreateShipmentClassRequestModel.class);

        System.out.println("\n\nCreateShipmentClassRequestModel Object\n\n" + c1.toString());


        // create JSON String from Object
        String jsonEmp = gson.toJson(c1);
        System.out.println("-----------------");
        System.out.print(jsonEmp);

        String fileData1 = new String(Files.readAllBytes(Paths
                .get("/Users/ssanapat/AWSSCMVendorVisibilityDataIngestionBatchModule/AlgoDs/src/test/Test1.txt")));


        CreateShipmentClassRequestModel s1 = gson.fromJson(fileData1,CreateShipmentClassRequestModel.class);
        // print object data
        //System.out.println("\n\nEmployee Object\n\n" + emp1);




        // create JSON String from Object
        String jsonEmps = gson.toJson(s1);
        System.out.println("-----------------");
        System.out.print(jsonEmps);


        System.out.println();
        System.out.println("--- Object Equality -----");
        System.out.println(s1.getShipmentClassPropertyList().equals(c1.getShipmentClassPropertyList()));
       System.out.println(s1.getDescription().equals(c1.getDescription()));
        System.out.println(s1.getId().equals(c1.getId()));
        System.out.println(s1.equals(c1));

    }


}
