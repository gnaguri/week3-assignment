package gogglesCommand;

public class GogglesCommandDemo {

	public static void main(String[] args) {

		Device swimmingGoggles = new SwimmingGoggles();

		Create swimmingGogglesCmd = new Create(swimmingGoggles);

		RemoteControl swimmingGogglesCmdControl = new RemoteControl(swimmingGogglesCmd);
		swimmingGogglesCmdControl.pressButton();

		Stop stopswimmingGoggles = new Stop(swimmingGoggles);

		RemoteControl stopswimmingGogglesControl = new RemoteControl(stopswimmingGoggles);
		stopswimmingGogglesControl.pressButton();

		System.out.println("\n");

		Device raceGoggles = new RaceGoggles();

		Stop stopRaceGoggles = new Stop(raceGoggles);

		RemoteControl stopRaceGogglesControl = new RemoteControl(stopRaceGoggles);
		stopRaceGogglesControl.pressButton();

		Create racingGogglesCmd = new Create(raceGoggles);

		RemoteControl racingGogglesCmdControl = new RemoteControl(racingGogglesCmd);
		racingGogglesCmdControl.pressButton();

	}

}
