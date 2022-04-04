package com.cg.services;

import java.util.List;
import com.cg.entities.TestAssign;

public interface TestAssignService {



	int getStudentMark(int studentId, int testId);

	List<TestAssign> getStudentProgress(int studentId);

	TestAssign addTestAssign(TestAssign test);

	

}
