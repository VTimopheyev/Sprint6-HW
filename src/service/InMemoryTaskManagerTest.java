package service;

import org.junit.jupiter.api.Test;

public class InMemoryTaskManagerTest extends TaskManagerTest<InMemoryTaskManager> {

    @Override
    @Test
    void testGettingHistoryManager() {
        super.testGettingHistoryManager();
    }

    @Override
    @Test
    void testingTaskCreation() {
        super.testingTaskCreation();
    }

    @Override
    @Test
    void testUpdateForTask() {
        super.testUpdateForTask();
    }

    @Override
    @Test
    void testEpicCreation() {
        super.testEpicCreation();
    }

    @Override
    @Test
    void testEpicUpdate() {
        super.testEpicUpdate();
    }

    @Override
    @Test
    void testSubtaskCreation() {
        super.testSubtaskCreation();
    }

    @Override
    @Test
    void testSubtaskUpdate() {
        super.testSubtaskUpdate();
    }

    @Override
    @Test
    void testEpicStatusUpdate() {
        super.testEpicStatusUpdate();
    }

    @Override
    @Test
    void testCheckingSubtasksInEpic() {
        super.testCheckingSubtasksInEpic();
    }

    @Override
    @Test
    void testCheckingSubtasksAllDoneInEpic() {
        super.testCheckingSubtasksAllDoneInEpic();
    }

    @Override
    @Test
    void testCheckingSubtasksAllNewInEpic() {
        super.testCheckingSubtasksAllNewInEpic();
    }

    @Override
    @Test
    void testGettingIssueById() {
        super.testGettingIssueById();
    }

    @Override
    @Test
    void testRemovingIssueById() {
        super.testRemovingIssueById();
    }

    @Override
    @Test
    void testRemovingAllRelatedSubtasks() {
        super.testRemovingAllRelatedSubtasks();
    }
}
