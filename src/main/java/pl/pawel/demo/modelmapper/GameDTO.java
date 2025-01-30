package pl.pawel.demo.modelmapper;

import lombok.Data;

@Data
public class GameDTO {
    private Long id;
    private String name;
    private String player;
    private int totalPlayers;
    private Long creationTime;
}
