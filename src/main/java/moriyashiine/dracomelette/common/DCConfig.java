package moriyashiine.dracomelette.common;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = Dracomelette.MODID)
public class DCConfig implements ConfigData {
	public float breakChance = 1 / 4f;
	
	public float teleportChance = 0.5f;
	
	public boolean spawnMultipleEggs = false;
}
