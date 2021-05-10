
public class KodlamaUI {
	public void PeopleAdd(BasePersonManager basePersonManager) {
		basePersonManager.add();
	}
	public void PeopleList(BasePersonManager basePersonManager) {
		basePersonManager.list();
	}
	public void PeopleDelete(BasePersonManager basePersonManager) {
		basePersonManager.delete();
	}
	public void PeopleUpdate(BasePersonManager basePersonManager) {
		basePersonManager.update();
	}
}
