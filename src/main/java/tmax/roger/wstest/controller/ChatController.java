package tmax.roger.wstest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tmax.roger.wstest.dto.ChatRoom;
import tmax.roger.wstest.service.ChatService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatController {
    private final ChatService chatService;

    /**
     * 방만들기
     */
    @PostMapping("/enterRoom")
    public ChatRoom createRoom(@RequestBody String userId, String friendId){
        // 친구관계 확인
        
        // 방이 없을 경우 방 생성 후 입장
        
        // 방이 있을 경우 방 입장
        
        
        return chatService.createRoom(friendId);
    }

    /**
     * 방 조회
     */
    @GetMapping("/room")
    public List<ChatRoom> findAllRoom(){
        return chatService.findAllRoom();
    }





}
