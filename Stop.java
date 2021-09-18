package gogglesCommand;

public class Stop implements Command{
	
	public Device backpackDevice ;
	
	public Stop(Device device) {
		backpackDevice = device;
	}

	public Device getBackpackDevice() {
		return backpackDevice;
	}

	public void setBackpackDevice(Device backpackDevice) {
		this.backpackDevice = backpackDevice;
	}

	@Override
	public void executeProcess() {
		 
		backpackDevice.stop();
	}

}
