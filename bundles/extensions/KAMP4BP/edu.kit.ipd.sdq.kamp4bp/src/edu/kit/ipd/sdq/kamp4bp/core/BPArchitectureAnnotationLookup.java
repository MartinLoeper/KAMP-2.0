package edu.kit.ipd.sdq.kamp4bp.core;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation;

public class BPArchitectureAnnotationLookup {
	public static Collection<BPUserActionAnnotation<?>> lookUpUserActionAnnotationsForUserAction(
			BPFieldOfActivityAnnotationsRepository annotationRepository, AbstractUserAction userAction) {
		Collection<BPUserActionAnnotation<?>> results = new LinkedList<BPUserActionAnnotation<?>>();
		if (annotationRepository.getBusinessProcessSpecification() != null) {
			for (BPUserActionAnnotation<?> userActionAnnotation : annotationRepository.getBusinessProcessSpecification()
					.getUserActionAnnotations()) {
				if (userActionAnnotation.getAnnotatedUserActions().contains(userAction)) {
					results.add(userActionAnnotation);
				}
			}
		}
		return results;
	}

	public static Collection<BPGood> lookUpBPGoodsForActorStep(
			BPFieldOfActivityAnnotationsRepository annotationRepository, ActorStep actorStep) {
		List<BPGood> goods = new LinkedList<BPGood>();
		if (annotationRepository.getBusinessProcessSpecification() != null) {
			for (BPUserActionAnnotation<?> userActionAnnotation : annotationRepository.getBusinessProcessSpecification()
					.getUserActionAnnotations()) {
				if (userActionAnnotation instanceof BPGood) {
					if (((BPGood) userActionAnnotation).getActorStep() == actorStep) {
						goods.add(((BPGood) userActionAnnotation));
					}
				}
			}
		}
		return goods;
	}

	public static Collection<BPTrainingCourse> lookUpBPTrainingCoursesForActorStep(
			BPFieldOfActivityAnnotationsRepository annotationRepository, ActorStep actorStep) {
		List<BPTrainingCourse> trainingCourses = new LinkedList<BPTrainingCourse>();
		if (annotationRepository.getBusinessProcessSpecification() != null) {
			for (BPUserActionAnnotation<?> userActionAnnotation : annotationRepository.getBusinessProcessSpecification()
					.getUserActionAnnotations()) {
				if (userActionAnnotation instanceof BPTrainingCourse) {
					if (((BPTrainingCourse) userActionAnnotation).getActorStep() == actorStep) {
						trainingCourses.add(((BPTrainingCourse) userActionAnnotation));
					}
				}
			}
		}
		return trainingCourses;
	}

	public static Collection<BPOrganizationalUnit> lookUpBPOrganizationalUnitsForAbstractUserAction(
			BPFieldOfActivityAnnotationsRepository annotationRepository, AbstractUserAction abstractUserAction) {
		List<BPOrganizationalUnit> organizationalUnits = new LinkedList<BPOrganizationalUnit>();
		if (annotationRepository.getBusinessProcessSpecification() != null) {
			for (BPUserActionAnnotation<?> userActionAnnotation : annotationRepository.getBusinessProcessSpecification()
					.getUserActionAnnotations()) {
				if (userActionAnnotation instanceof BPOrganizationalUnit) {
					if (((BPOrganizationalUnit) userActionAnnotation).getAbstractUserAction() == abstractUserAction) {
						organizationalUnits.add(((BPOrganizationalUnit) userActionAnnotation));
					}
				}
			}
		}
		return organizationalUnits;
	}

	public static Collection<BPMessage> lookUpBPMessagesForActorStep(
			BPFieldOfActivityAnnotationsRepository annotationRepository, ActorStep actorStep) {
		List<BPMessage> messages = new LinkedList<BPMessage>();
		if (annotationRepository.getBusinessProcessSpecification() != null) {
			for (BPUserActionAnnotation<?> userActionAnnotation : annotationRepository.getBusinessProcessSpecification()
					.getUserActionAnnotations()) {
				if (userActionAnnotation instanceof BPMessage) {
					if (((BPMessage) userActionAnnotation).getSender() == actorStep
							|| ((BPMessage) userActionAnnotation).getReceiver() == actorStep) {
						messages.add(((BPMessage) userActionAnnotation));
					}
				}
			}
		}
		return messages;
	}
}
