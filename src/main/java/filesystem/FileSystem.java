package filesystem;

import catalog.Catalog;

import java.util.ArrayList;

public class FileSystem {

    private final int totalBlockCount = 0; // сколько блоков было всего выделено под систему

    private ArrayList<Block> systemBlocks;

    private Catalog catalog;

    private ArrayList<Block> dataBlocks;

    private FileSystem instance;

    private FileSystem(){

    }

    public FileSystem getInstance() {
        return instance;
    }

    int enter(String fileName, int sizeFile){
        throw new UnsupportedOperationException();
    }

    int open(String fileName){
        throw new UnsupportedOperationException();
    }

    int read(int blockNumber, String fileName){
        throw new UnsupportedOperationException();
    }

    int write(Block block, String fileName){
        throw new UnsupportedOperationException();
    }

    int close(String fileName){
        throw new UnsupportedOperationException();
    }

    int rename(String fileName, String newType){
        throw new UnsupportedOperationException();
    }

    int delete(String fileName){
        throw new UnsupportedOperationException();
    }
}
