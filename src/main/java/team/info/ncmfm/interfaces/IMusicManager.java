package team.info.ncmfm.interfaces;

import team.info.ncmfm.model.PlayListContainer;
import team.info.ncmfm.model.SubListContainer;
import team.info.ncmfm.model.TrackContainer;

import java.util.ArrayList;

public interface IMusicManager {
    ArrayList<PlayListContainer> LoadPlayList();

    ArrayList<TrackContainer> LoadTrackList(long id);

    ArrayList<SubListContainer> LoadSubList();

    String GetMusicById(long id);

    void updateLoginState();

    void login();
}
