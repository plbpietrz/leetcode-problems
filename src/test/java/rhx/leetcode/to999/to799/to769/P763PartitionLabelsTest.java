package rhx.leetcode.to999.to799.to769;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P763PartitionLabelsTest {

    private P763PartitionLabels sut;

    @BeforeEach
    public void setup() {
        sut = new P763PartitionLabels();
    }

    @Test
    void test_1() {
        assertIterableEquals(
                List.of(9, 7, 8),
                sut.partitionLabels("ababcbacadefegdehijhklij")
        );
    }
}