package racingcar.controller;

import racingcar.domain.players.Player;
import racingcar.domain.players.Players;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarController {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingCarController(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }
    public void run() {
        final Players players = getPlayers();
        players.getPlayers();
    }

    private Players getPlayers() {
        final List<Player> players = new ArrayList<>();

        players.addAll(createPlayers());

        return new Players(players);
    }
    private List<Player> createPlayers() {
        final List<String> playerNames = inputView.readNames();
        return playerNames.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }
}
