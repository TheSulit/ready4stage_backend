package com.ready4stage.backend.Database;

public class initDatabase {

    public void initializeDB() {
        try {
            Process process;
            if(isWindows()) {
                process = Runtime.getRuntime().exec("python src\\main\\resources\\db\\createDockerDB.py");
            } else {
                process = Runtime.getRuntime().exec("python src/main/resources/db/createDockerDB.py");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

}