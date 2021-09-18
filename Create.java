package gogglesCommand;

public class Create implements Command{
	
	public Device backpackDevice ;

	public Create(Device device) {
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
		 
		backpackDevice.create();
	}

}
