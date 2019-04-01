package com.rj.design.study.command.eg;

/**
 * @version 1.0.0
 * @desc
 * @auth rj
 * @date 2019/1/13
 * @modifyBy
 */
public class Client {

    public static void main(String[] args) {
        MainBoardApi mainBoardApi = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoardApi);

        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.openButtonPressed();

    }
}
