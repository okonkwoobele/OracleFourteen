package diary;

import java.util.List;

public  class Dairy {

    private final String password;
    private  boolean isLocked= false;
    private List<Entry> entries;

    public Dairy(String username,String password){
        this.password = password;
    }
    public void unlockDairy(String password){
        isLocked = !password.equals(this.password);
    }

    public void lockDairy(){
        isLocked();
    }
    public boolean isLocked(){
        return isLocked = true;
    }
    public void createEntry(String title, String body){
        Entry entry = new Entry(title, body, 1);
        entries.add(entry);
    }
    public boolean deleteEntry(int entryId){
        Entry id = findEntryById(1);
        entries.remove(id);
        System.out.println("deleted");
        return false;
    }
    public Entry findEntryById(int entryId){
        return entries.get(entryId);
    }
    public void updateEntry(int entryId, String title, String body){
        var foundEntry = findEntryById(1);
        foundEntry.setTittle(title);
        foundEntry.setBody(body);
        entries.add(foundEntry);
    }
}