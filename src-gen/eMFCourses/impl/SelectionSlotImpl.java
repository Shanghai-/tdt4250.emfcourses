/**
 */
package eMFCourses.impl;

import eMFCourses.Course;
import eMFCourses.EMFCoursesPackage;
import eMFCourses.SelectionSlot;
import eMFCourses.Semester;
import eMFCourses.StatusCode;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMFCourses.impl.SelectionSlotImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link eMFCourses.impl.SelectionSlotImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link eMFCourses.impl.SelectionSlotImpl#getMaxCredits <em>Max Credits</em>}</li>
 *   <li>{@link eMFCourses.impl.SelectionSlotImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionSlotImpl extends MinimalEObjectImpl.Container implements SelectionSlot {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusCode status;

	/**
	 * The default value of the '{@link #getMaxCredits() <em>Max Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_CREDITS_EDEFAULT = 7.5F;

	/**
	 * The cached value of the '{@link #getMaxCredits() <em>Max Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCredits()
	 * @generated
	 * @ordered
	 */
	protected float maxCredits = MAX_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFCoursesPackage.Literals.SELECTION_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMaxCredits() {
		return maxCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCredits(float newMaxCredits) {
		float oldMaxCredits = maxCredits;
		maxCredits = newMaxCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.SELECTION_SLOT__MAX_CREDITS,
					oldMaxCredits, maxCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		if (eContainerFeatureID() != EMFCoursesPackage.SELECTION_SLOT__SEMESTER)
			return null;
		return (Semester) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSemester, EMFCoursesPackage.SELECTION_SLOT__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer()
				|| (eContainerFeatureID() != EMFCoursesPackage.SELECTION_SLOT__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject) newSemester).eInverseAdd(this, EMFCoursesPackage.SEMESTER__SLOTS,
						Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.SELECTION_SLOT__SEMESTER,
					newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusCode getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusCode newStatus) {
		StatusCode oldStatus = status;
		status = newStatus == null ? null : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFCoursesPackage.SELECTION_SLOT__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getOptions() {
		if (options == null) {
			options = new EObjectResolvingEList<Course>(Course.class, this, EMFCoursesPackage.SELECTION_SLOT__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean validChoice(Course course) {
		return this.getOptions().contains(course);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFCoursesPackage.SELECTION_SLOT__SEMESTER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSemester((Semester) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFCoursesPackage.SELECTION_SLOT__SEMESTER:
			return basicSetSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case EMFCoursesPackage.SELECTION_SLOT__SEMESTER:
			return eInternalContainer().eInverseRemove(this, EMFCoursesPackage.SEMESTER__SLOTS, Semester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMFCoursesPackage.SELECTION_SLOT__SEMESTER:
			return getSemester();
		case EMFCoursesPackage.SELECTION_SLOT__STATUS:
			return getStatus();
		case EMFCoursesPackage.SELECTION_SLOT__MAX_CREDITS:
			return getMaxCredits();
		case EMFCoursesPackage.SELECTION_SLOT__OPTIONS:
			return getOptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EMFCoursesPackage.SELECTION_SLOT__SEMESTER:
			setSemester((Semester) newValue);
			return;
		case EMFCoursesPackage.SELECTION_SLOT__STATUS:
			setStatus(newValue);
			return;
		case EMFCoursesPackage.SELECTION_SLOT__MAX_CREDITS:
			setMaxCredits((Float) newValue);
			return;
		case EMFCoursesPackage.SELECTION_SLOT__OPTIONS:
			getOptions().clear();
			getOptions().addAll((Collection<? extends Course>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EMFCoursesPackage.SELECTION_SLOT__SEMESTER:
			setSemester((Semester) null);
			return;
		case EMFCoursesPackage.SELECTION_SLOT__STATUS:
			setStatus((StatusCode) null);
			return;
		case EMFCoursesPackage.SELECTION_SLOT__MAX_CREDITS:
			setMaxCredits(MAX_CREDITS_EDEFAULT);
			return;
		case EMFCoursesPackage.SELECTION_SLOT__OPTIONS:
			getOptions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EMFCoursesPackage.SELECTION_SLOT__SEMESTER:
			return getSemester() != null;
		case EMFCoursesPackage.SELECTION_SLOT__STATUS:
			return status != null;
		case EMFCoursesPackage.SELECTION_SLOT__MAX_CREDITS:
			return maxCredits != MAX_CREDITS_EDEFAULT;
		case EMFCoursesPackage.SELECTION_SLOT__OPTIONS:
			return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EMFCoursesPackage.SELECTION_SLOT___VALID_CHOICE__COURSE:
			return validChoice((Course) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(", maxCredits: ");
		result.append(maxCredits);
		result.append(')');
		return result.toString();
	}

} //SelectionSlotImpl
