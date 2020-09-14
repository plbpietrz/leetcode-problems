package rhx.leetcode.to999.to799.to769;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
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

    @Test
    void test_2() {
        assertIterableEquals(
                List.of(246, 254),
                sut.partitionLabels("ntswuqqbidunnixxpoxxuuupotaatwdainsotwvpxpsdvdbwvbtdiptwtxnnbtqbdvnbowqitudutpsxsbbsvtipibqpvpnivottsxvoqqaqdxiviidivndvdtbvadnxboiqivpusuxaaqnqaobutdbpiosuitdnopoboivopaapadvqwwnnwvxndpxbapixaspwxxxvppoptqxitsvaaawxwaxtbxuixsoxoqdtopqqivaitnpvutzchkygjjgjkcfzjzrkmyerhgkglcyffezmehjcllmlrjghhfkfylkgyhyjfmljkzglkklykrjgrmzjyeyzrrkymccefggczrjflykclfhrjjckjlmglrmgfzlkkhffkjrkyfhegyykrzgjzcgjhkzzmzyejycfrkkekmhzjgggrmchkeclljlyhjkchmhjlehhejjyccyegzrcrerfzczfelzrlfylzleefgefgmzzlggmejjjygehmrczmkrc")
        );
    }

    @Test
    void test_3() {
        assertIterableEquals(List.of(1, 1, 1), sut.partitionLabels("abc"));
    }

    @Test
    void test_4() {
        assertIterableEquals(List.of(1), sut.partitionLabels(""));
    }
}