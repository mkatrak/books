package headfirst.command.remote;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(final Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
