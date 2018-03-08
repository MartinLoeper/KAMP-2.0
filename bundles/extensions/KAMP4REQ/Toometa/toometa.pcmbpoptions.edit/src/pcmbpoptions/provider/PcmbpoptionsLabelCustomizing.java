package pcmbpoptions.provider;

import pcmbpoptions.PCM_EntityOption;

public class PcmbpoptionsLabelCustomizing {

	public static String customize(PCM_EntityOption option) {
		if (option.getDescription() != null) {
			return "\""+ option.getDescription() + "\"";
		} else {
			return "with id \"" + option.getId() + "\"";
		}
	}
	
}
