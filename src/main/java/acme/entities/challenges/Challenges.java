
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenges extends DomainEntity {

	public static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@NotBlank
	private String				description;

	@NotBlank
	private String				rookieGoal;

	@NotBlank
	private String				averageGoal;

	@NotBlank
	private String				expertGoal;

	@Valid
	private Money				rookieReward;

	@Valid
	private Money				averageReward;

	@Valid
	private Money				expertReward;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;
}
