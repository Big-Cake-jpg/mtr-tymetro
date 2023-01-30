package net.lihaoyu.tymetro;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TYMetroMod implements ModInitializer {
    /* 声明和初始化我们的自定义方块实例。
       我们将方块材质（material）设置为 METAL（金属）。
       
       `strength` 会将方块的硬度和抗性设为同一个值。
       硬度决定了方块需要多久挖掘，抗性决定了方块抵御爆破伤害（如爆炸）的能力。
       石头的硬度为 1.5f，抗性为 6.0f，黑曜石的硬度为 50.0f，抗性为 1200.0f。
       
       可以在`Blocks`类中查找所有原版方块的统计。
    */
    public static final Block LOGO = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
 
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("tymetro", "logo"), LOGO);
        Registry.register(Registry.ITEM, new Identifier("tymetro", "logo"), new BlockItem(LOGO, new FabricItemSettings()));
    }
}
