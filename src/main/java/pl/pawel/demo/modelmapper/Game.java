package pl.pawel.demo.modelmapper;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Game {
    private Long id;
    private String name;
    private Long timestamp;

    private Player creator;
    private List<Player> players = new ArrayList<>();

    public Game(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
