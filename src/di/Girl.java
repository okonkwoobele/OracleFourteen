package di;

public class Girl {
    private BoyFriend boyFriend = new illasaBoy();

    public Girl(BoyFriend boyFriend){
        this.boyFriend =boyFriend;
    }
    public void setBoyfriend(BoyFriend boyFriend){
        this.boyFriend = boyFriend;
    }
}
