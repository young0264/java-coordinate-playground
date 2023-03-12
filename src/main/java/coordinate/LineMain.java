package coordinate;

import coordinate.domain.Line;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class LineMain {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        outputView.initNotice();
        Line line = inputView.lineInit();
        OutputView.main(line.getPoints());
        OutputView.printLineResult(line);

    }
}
