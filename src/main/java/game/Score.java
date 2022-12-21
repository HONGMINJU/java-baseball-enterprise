package game;

public class Score {
    private int ball;
    private int strike;

    public Score(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void plusBall() {
        this.ball++;
    }

    public int getStrike() {
        return strike;
    }

    public void plusStrike() {
        this.strike++;
    }
}