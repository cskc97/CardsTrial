package apps.everythingforward.com.cardstrial;

import com.orm.SugarRecord;

/**
 * Created by santh on 2/15/2017.
 */

public class Notes extends SugarRecord {
    String noteName;
    public Notes()
    {

    }

    public Notes(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }
}
