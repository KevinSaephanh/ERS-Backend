package services;

import java.util.List;

import dao.ReimbursementDao;
import models.Reimbursement;
import utils.InputUtil;

public class ReimbursementService {
	private ReimbursementDao rd = new ReimbursementDao();
	
	public List<Reimbursement> getAllReimbs() {
		List<Reimbursement> reimbs = rd.getAllReimbs();
		return reimbs;
	}
	
	public Reimbursement getReimb() {
		return null;
	}
	
	public int createReimb(Reimbursement reimb) {
		// Validate amount input
		if (!InputUtil.isValidAmount(reimb.getAmount()))
			return 0;
		int createCount = rd.createReimb(reimb);
		return createCount;
	}
	
	public Reimbursement updateReimb(int reimbId, int resolverId, int statusId) {
		Reimbursement reimbursement = new Reimbursement();
		reimbursement = rd.updateReimb(reimbId, resolverId, statusId);
		return reimbursement;
	}
	
	public int deleteReimb(int id) {
		int deleteCount = rd.deleteReimb(id);
		return deleteCount;
	}
}
