package com.yedam;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BoardApp {
	
    private List<Board> boardList = new ArrayList<>();
    private static final String FILE_PATH = "C:/temp/boardList.dat";

    public void register(int no, String title, String section, String name) {
        Board newBoard = new Board(no, title, section, name, LocalDateTime.now());
        boardList.add(newBoard);
    }

    public void modify(int no, String newSection ) {
        for (Board board : boardList) {
            if (board.getNo() == no) {
                board.setSection(newSection);
                board.setDay(LocalDateTime.now());
                break;
            }
        }
    }

    public Board getBoard(int no) {
        for (Board board : boardList) {
            if (board.getNo() == no) {
                return board;
            }
        }
        return null;
    }

    public void remove(int no) {
        boardList.removeIf(board -> board.getNo() == no);
    }

    public List<Board> getList() {
        return boardList;
    }

    public void init() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            boardList = (List<Board>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("게시글 파일을 찾을 수 없습니다. 새로운 목록을 생성합니다.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(boardList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
