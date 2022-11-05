package baseball;

import java.util.List;

public interface NumberMatchProcessor {

    /**
     * game의 숫자와 user의 숫자를 입력받아
     * 스트라이크, 볼 갯수를 리턴한다.
     * 입력값이 3자리 숫자가 아닌경우 예외를 리턴한다.
     * @param gameNum - 현재 게임의 3자리 숫자
     * @param userNum - 유저 입력의 3자리 숫자
     * @return Integer List - [스트라이크 갯수, 볼 갯수]
     */
    List<Integer> compare(int gameNum, int userNum);

}
