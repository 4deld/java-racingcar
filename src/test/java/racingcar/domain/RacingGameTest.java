package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import racingcar.domain.players.Player;
import racingcar.domain.players.Players;
import racingcar.domain.trycount.TryCount;

import java.util.List;

public class RacingGameTest {
    private Players players;
    private TryCount tryCount;

    @BeforeEach
    void init() {
        players = new Players(List.of(
                new Player("kokodak"),
                new Player("kuku"),
                new Player("cucu")
        ));
        tryCount = new TryCount("1");

    }

//    @Test
//    void 승자를_찾는다() {
//        List<Player> L = new ArrayList<>() {{
//            add(new Player("aa"));
//            add(new Player("bb"));
//        }};
//
//        final RacingGame racingGame = new RacingGame(players, tryCount);
//
//        final List<Player> winners = racingGame.findWinners();
//
//        assertThat(winners).isEqualTo(L);
//    }
//
//    @Test
//    void 카드를_더_받을_수_있는_플레이어가_없다면_예외를_던진다() {
//        final Player kokodak = new Player("kokodak");
//        final Player dani = new Player("dani");
//        participants = new Participants(List.of(new Dealer(), kokodak, dani));
//        final BlackJackGame blackJackGame = new BlackJackGame(participants, deck, bettingManager, 0);
//
//        blackJackGame.drawOrNot(false, kokodak);
//        blackJackGame.drawOrNot(false, dani);
//
//        assertThatThrownBy(blackJackGame::findDrawablePlayer)
//                .isInstanceOf(NoSuchElementException.class)
//                .hasMessage("카드를 받을 수 있는 플레이어가 존재하지 않습니다.");
//    }
//
//    @Test
//    void 카드를_더_받을_수_있는_플레이어가_있는지_확인한다() {
//        final BlackJackGame blackJackGame = new BlackJackGame(participants, deck, bettingManager, 0);
//
//        assertThat(blackJackGame.existDrawablePlayer()).isTrue();
//    }
}
