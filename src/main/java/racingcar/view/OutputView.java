package racingcar.view;

import racingcar.view.dto.PlayerResponse;

import static java.text.MessageFormat.format;

public class OutputView {

    public void printa(final PlayerResponse player) {
        System.out.println(getPlayersData(player));
    }

    private String getPlayersData(final PlayerResponse player) {
        final String name = player.getName();
        final String distance = player.getDistance();

        return format("{0} : {1}\n", name, distance);
    }

}
