package pl.liquidkit.springinaction4.chapter01.context;

/**
 * Created by Jacek on 2016-01-05.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
