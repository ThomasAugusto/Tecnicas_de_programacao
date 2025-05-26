package designPatters.structuralPatterns.decorator;

import java.io.*;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource() {
        this.name = name;
    }

    @Override
    public void EscreverDados(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String LerDados() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)){
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            System.out.println();
        }
        return new String(buffer);
    }
}
