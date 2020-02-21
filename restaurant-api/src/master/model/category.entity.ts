import { IdEnable } from "src/common/id.enable"
import { Column, Entity, Index, PrimaryGeneratedColumn } from "typeorm"

@Entity()
export class Category  implements IdEnable{
    
    @PrimaryGeneratedColumn()
    id:number

    @Index({unique : true})
    @Column()
    name:string
    @Column({ nullable : true })
    backColor?:string
    @Column({ nullable: true })
    fillColor?:string
}