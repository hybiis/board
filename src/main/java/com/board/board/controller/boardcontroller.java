package com.board.board.controller;

import com.board.board.entity.Board;
import com.board.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class boardcontroller {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public  String boardWriteForm() {

        return "boardwrite";
    }
    @PostMapping("/board/writepro")
    public String boardwritePro(Board board){

        boardService.write(board);

        return  "";

    }

    @GetMapping("/board/list")
    public String boardlist(Model model){

        model.addAttribute("list",boardService.boardlist());
        return "boardlist";
    }
}
