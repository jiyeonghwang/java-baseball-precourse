package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Baseball {
    public static final String STRIKE = "스트라이크";
    public static final String BALL = "볼";
    public static final String NOTHING = "낫싱";

    private List<Integer> computer;
    private List<Integer> user;

    public List<Integer>  getComputer() {
        return this.computer;
    }

    public void setComputer(String num) {
        List<Integer> tempComputer = new ArrayList<>();
        tempComputer.add(Character.getNumericValue(num.charAt(0)));
        tempComputer.add(Character.getNumericValue(num.charAt(1)));
        tempComputer.add(Character.getNumericValue(num.charAt(2)));
        this.computer = tempComputer;
    }

    public List<Integer> getUser() {
        return this.user;
    }

    public void setUser(String num) {
        List<Integer> tempUser = new ArrayList<>();
        tempUser.add(Character.getNumericValue(num.charAt(0)));
        tempUser.add(Character.getNumericValue(num.charAt(1)));
        tempUser.add(Character.getNumericValue(num.charAt(2)));
        this.user = tempUser;
    }

    public boolean isVictory() {
        boolean result = false;
        if (this.computer.get(0).equals(this.user.get(0)) &&
                this.computer.get(1).equals(this.user.get(1)) &&
                this.computer.get(2).equals(this.user.get(2))) {
            result = true;
        }

        return result;
    }

    public String result() {
        int strikeCnt = getStrikeCnt();
        int ballCnt = getBallCnt(strikeCnt);

        if (strikeCnt > 0 || ballCnt > 0) {
            return resultString(ballCnt, strikeCnt);
        }

        return NOTHING;
    }

    public String resultString(int ballCnt, int strikeCnt) {
        StringBuilder sb = new StringBuilder();
        if (ballCnt > 0) {
            sb.append(ballCnt + BALL + " ");
        }
        if (strikeCnt > 0) {
            sb.append(strikeCnt + STRIKE);
        }
        return sb.toString();
    }

    public int getStrikeCnt() {
        int result = 0;
        if (this.computer.get(0).equals(this.user.get(0))) result++;
        if (this.computer.get(1).equals(this.user.get(1))) result++;
        if (this.computer.get(2).equals(this.user.get(2))) result++;
        return result;
    }

    public int getBallCnt(int strikeCnt) {
        int result = 0;
        if (this.user.contains(this.computer.get(0))) result++;
        if (this.user.contains(this.computer.get(1))) result++;
        if (this.user.contains(this.computer.get(2))) result++;
        if (result > strikeCnt) return result-strikeCnt;
        return 0;
    }
}
