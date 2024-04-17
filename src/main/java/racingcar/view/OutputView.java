package racingcar.view;

import racingcar.view.dto.PlayerResponse;

import java.util.List;
import java.util.stream.Collectors;

import static java.text.MessageFormat.format;

public class OutputView {

    private static final String PRINT_PATTERN = "{0} : {1}";

    public void printPlayerData(final PlayerResponse player) {
        System.out.println(getPlayerData(player));
    }

    private String getPlayerData(final PlayerResponse player) {
        final String name = player.getName();
        final String movement = player.getMovement();

        return format(PRINT_PATTERN, name, movement);
    }

    public void printResultMessage() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public void printResult(final List<PlayerResponse> players) {
        System.out.println();
        System.out.println(format("{0}가 최종 우승했습니다.", getNamesFormat(players)));
    }
    private String getNamesFormat(final List<PlayerResponse> players) {
        return players.stream()
                .map(PlayerResponse::getName)
                .collect(Collectors.joining(", "));
    }

}
