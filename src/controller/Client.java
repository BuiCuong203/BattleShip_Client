package controller;

import model.User;
import views.CompetitorInfoFrm;
import views.CreateRoomPasswordFrm;
import views.FriendRequestFrm;
import views.GameNoticeFrm;
import views.HomePageFrm;
import views.LoginFrm;
import views.RankFrm;
import views.RegisterFrm;
import views.RoomNameFrm;
import views.WaitingRoomFrm;

public class Client {
    public static User user;
    public static SocketHandle socketHandle;
    public static LoginFrm loginFrm;
    public static RegisterFrm registerFrm;
    public static GameNoticeFrm gameNoticeFrm;
    public static HomePageFrm homePageFrm;
    public static RankFrm rankFrm;
    public static CompetitorInfoFrm competitorInfoFrm;
    public static FriendRequestFrm friendRequestFrm;
    public static WaitingRoomFrm waitingRoomFrm;
    public static CreateRoomPasswordFrm createRoomPasswordFrm;
    public static RoomNameFrm roomNameFrm;
    
    public Client() {
    }
    
    public static void openView(View viewName, int arg1, String arg2) {
        if (viewName != null) {
            switch (viewName) {
//                case JOIN_ROOM_PASSWORD:
//                    joinRoomPasswordFrm = new JoinRoomPasswordFrm(arg1, arg2);
//                    joinRoomPasswordFrm.setVisible(true);
//                    break;
                case FRIEND_REQUEST:
                    friendRequestFrm = new FriendRequestFrm(arg1, arg2);
                    friendRequestFrm.setVisible(true);
            }
        }
    }
    
    public static void openView(View viewName, User user) {
        if (viewName == View.COMPETITOR_INFO) {
            competitorInfoFrm = new CompetitorInfoFrm(user);
            competitorInfoFrm.setVisible(true);
        }
    }
    
    public static void openView(View viewName, String arg1, String arg2) {
        if (viewName != null) {
            switch (viewName) {
                case GAME_NOTICE:
                    gameNoticeFrm = new GameNoticeFrm(arg1, arg2);
                    gameNoticeFrm.setVisible(true);
                    break;
                case LOGIN:
                    loginFrm = new LoginFrm(arg1, arg2);
                    loginFrm.setVisible(true);
            }
        }
    }
    
    public static void openView(View viewName) {
        if (viewName != null) {
            switch (viewName) {
                case LOGIN:
                    loginFrm = new LoginFrm();
                    loginFrm.setVisible(true);
                    break;
                case REGISTER:
                    registerFrm = new RegisterFrm();
                    registerFrm.setVisible(true);
                    break;
                case HOMEPAGE:
                    homePageFrm = new HomePageFrm();
                    homePageFrm.setVisible(true);
                    break;
                case RANK:
                    rankFrm = new RankFrm();
                    rankFrm.setVisible(true);
                    break;
                case WAITING_ROOM:
                    waitingRoomFrm = new WaitingRoomFrm();
                    waitingRoomFrm.setVisible(true);
                    break;
                case CREATE_ROOM_PASSWORD:
                    createRoomPasswordFrm = new CreateRoomPasswordFrm();
                    createRoomPasswordFrm.setVisible(true);
                case ROOM_NAME_FRM:
                    roomNameFrm = new RoomNameFrm();
                    roomNameFrm.setVisible(true);
            }
        }
    }
    
    public static void closeView(View viewName) {
        if (viewName != null) {
            switch (viewName) {
                case LOGIN:
                    loginFrm.dispose();
                    break;
                case REGISTER:
                    registerFrm.dispose();
                    break;
                case GAME_NOTICE:
                    gameNoticeFrm.dispose();
                    break;
                case HOMEPAGE:
                    homePageFrm.dispose();
                    break;
                case RANK:
                    rankFrm.dispose();;
                    break;
                case COMPETITOR_INFO:
                    competitorInfoFrm.dispose();
                    break;
                case FRIEND_REQUEST:
                    friendRequestFrm.dispose();
                    break;
                case WAITING_ROOM:
                    waitingRoomFrm.dispose();
                    break;
                case CREATE_ROOM_PASSWORD:
                    createRoomPasswordFrm.dispose();
                    break;
                case ROOM_NAME_FRM:
                    roomNameFrm.dispose();
                    break;
            }
        }
    }
    
    public static void closeAllViews() {
        if (loginFrm != null) loginFrm.dispose();
        if (registerFrm != null) registerFrm.dispose();
        if (gameNoticeFrm != null) gameNoticeFrm.dispose();
        if (homePageFrm != null) homePageFrm.dispose();
        if (rankFrm != null) rankFrm.dispose();
        if (competitorInfoFrm != null) competitorInfoFrm.dispose();
        if (friendRequestFrm != null) friendRequestFrm.dispose();
        if (waitingRoomFrm != null) waitingRoomFrm.dispose();
        if (createRoomPasswordFrm != null) createRoomPasswordFrm.dispose();
        if (roomNameFrm != null) roomNameFrm.dispose();
    }
    
    public static void main(String[] args) {
        new Client().initView();
    }

    public void initView() {
        loginFrm = new LoginFrm();
        loginFrm.setVisible(true);
        socketHandle = new SocketHandle();
        socketHandle.run();
    }
    
    public enum View {
        LOGIN,
        REGISTER,
        GAME_NOTICE,
        HOMEPAGE,
        RANK,
        COMPETITOR_INFO,
        FRIEND_REQUEST,
        WAITING_ROOM,
        CREATE_ROOM_PASSWORD,
        ROOM_NAME_FRM
    }
}
