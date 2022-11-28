package problema01;

public class Manager {

	public void managingThis(ObjectOfManaging objectOfManaging, int choice) {
		switch (choice) {
		case 1:
			new Solution().solveThis(objectOfManaging);
			break;
		case 2:
			new Inhibition().inhibitThis(objectOfManaging);
			break;

		default:
			new Exclusion().excludeThis(objectOfManaging);
			break;
		}
	}
}
