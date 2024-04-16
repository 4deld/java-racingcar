package racingcar.view;

import org.kokodak.Console;
import racingcar.domain.trycount.TryCount;

import java.util.List;

public class InputView {

    public List<String> readNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        final String input = Console.readLine();
        final List<String> names = Parser.parseByDelimiter(input, ",");

        return Parser.trim(names);
    }
    public TryCount readTryCount() {
        System.out.println();
        System.out.println("시도할 회수는 몇회인가요?");

        return new TryCount(Console.readLine());
    }
}
