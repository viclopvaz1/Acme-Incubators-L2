
package acme.forms;

import java.io.Serializable;
import java.util.Collection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable {

	private static final long	serialVersionUID	= 1L;

	Collection<Object[]>		totalNumberOftTechnologiesGroupedByActivitySector;

	Collection<Object[]>		ratioOfOpenSourceTechnologies;

	Collection<Object[]>		totalNumberOfToolsGroupedByActivitySector;

	Collection<Object[]>		ratioOfOpenSourceToolsVersusClosedSourceTools;

	Double						totalTools;

	Double						totalTechnologies;

}
