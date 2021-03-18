package co.tiendaCerca.utils;

import co.tiendaCerca.logs.Log;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeneralUtilities {
    private GeneralUtilities() {
        throw new IllegalStateException("Utility class");
    }

    public static String currentDateGenerator(String dateFormat) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


    public static void createDirectory(String path) {
        new File(path).mkdir();
        path="ubicación del directorio creado: ".concat(path);
        Log.LOGGER.info(path);
    }

    public static void deleteFile(String path){
        File file = new File(path);
        path="ubicación del archivo a eliminar: ".concat(path);
        Log.LOGGER.info(path);
        if(file.exists()) {
            if(file.delete()) {
                Log.LOGGER.info("No se pudo eliminar el archivo");
            }else{
                Log.LOGGER.info("archivo eliminado");
            }
        }else{
            Log.LOGGER.info("no se encontró el archivo");
        }
    }


}
