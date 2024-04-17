package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.domain.players.Player;
import racingcar.domain.players.Players;
import racingcar.domain.trycount.TryCount;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.dto.PlayerResponse;

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

        final TryCount tryCount = getTryCount();

        final RacingGame racingGame = initRacingGame(players, tryCount);


        for(int i=0; i<tryCount.getTryCount(); i++){
            race(racingGame);
            for(Player p :players.getPlayers()){
                printb(p);
            }

        }

        printResult(racingGame);


    }

    private void printb(final Player player) {
            outputView.printa(PlayerResponse.from(player));
    }

    private void race(final RacingGame racingGame) {
        racingGame.startRace();
    }

    private void printResult(RacingGame racingGame) {
    }

    private RacingGame initRacingGame(Players players, TryCount tryCount) {
        final RacingGame racingGame = new RacingGame(players, tryCount);

        return racingGame;
    }

    private TryCount getTryCount() {
        return new TryCount(inputView.readTryCount());
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
