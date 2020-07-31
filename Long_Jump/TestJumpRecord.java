public class TestJumpRecord {
    public static void main(final String[] args) {
        final JumpRecord jumpRecord = new JumpRecord(3);

        //Test 1
        if (jumpRecord.maxJumps() == 3) {
            System.out.println("Test 1 \n Pass");
        } else {
            System.out.println("Test 1 \n Fail");
        }

        //Test 2
        jumpRecord.recordJump(2.9);

        if (jumpRecord.jumps() == 1) {
            System.out.println("Test 2 \n Pass");
        } else {
            System.out.println("Test 2 \n Fail");
        }

        //Test 3
        jumpRecord.recordFoulJump();

        if (jumpRecord.isFoulJump(2)) {
            System.out.println("Test 3 \n Pass");
        } else {
            System.out.println("Test 3 \n Fail");
        }

        //Test 4
        if (jumpRecord.finished() == false) {
            System.out.println("Test 4 \n Pass");
        } else {
            System.out.println("Test 4 \n Fail");
        }

        //Test 5
        jumpRecord.recordJump(3.0);

        if (jumpRecord.getLongest() == 3) {
            System.out.println("Test 5 \n Pass");
        } else {
            System.out.println("Test 5 \n Fail");
        }


        //Test 6
        if (jumpRecord.foulJumps() == 1) {
            System.out.println("Test 6 \n Pass");
        } else {
            System.out.println("Test 6 \n Fail");
        }

        //Test 7
        if (jumpRecord.jumps() == 3) {
            System.out.println("Test 7 \n Pass");
        } else {
            System.out.println("Test 7 \n Fail");
        }

        //Below are the tests which are meant to be failed because of wrong inputs
        /*
        jumpRecord.recordFoulJump();
        //Test 8
        if(jumpRecord.jumps() == 4) {
            System.out.println("Test 8 \n Fail");
        }
        else {
            System.out.println("Test 8 \n Pass");
        }

        //Test 9
        if(jumpRecord.maxJumps() == 10) {
            System.out.println("Test 9 \n Pass");
        }
        else {
            System.out.println("Test 9 \n Fail");
        }


    }

    */


    }
}