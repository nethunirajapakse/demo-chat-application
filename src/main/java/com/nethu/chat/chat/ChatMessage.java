package com.nethu.chat.chat;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
}
